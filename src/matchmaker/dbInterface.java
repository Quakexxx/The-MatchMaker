/**
 * Database interface for The-MatchMaker.
 *
 * @author eferdi
 */
package matchmaker;
import java.io.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    public class dbInterface
    {
        private String dbPath; // = "c:/temp/data.sqlite";
        private File dbFile; // = new File(this.dbPath);
        private Connection db;
        private String tankTable = "Tanks";
        private String tankTableFields = "Name, Tier, Class, Nation, Special, minBT, maxBT, UID";
        private String tankTableExclude = "NOT(Tier = 0 OR minBT = 0 OR maxBT = 0)";

        public dbInterface(String argDBName) throws Exception{
            if(!this.initMe(argDBName))
            {
                throw new Exception("Der ging nicht durch!");
            }
        }

        /**
         * Initialize the DB connection
         *
         * @param argDBName [String] SQLite DB file w/ including path
         * @return TRUE if the DB exists and could be opened / FALSE if not
         */
        public boolean initMe(String argDBName)
        {
            try
            {
                Class.forName("org.sqlite.JDBC");
            }catch(Exception e)
            {
                e.printStackTrace();
            }

            this.dbPath = argDBName;

            if (doesDBExists())
            {
                if(this.openDB())
                {
                    return true;
                }
                return false;
            }

            return false;
        }

        /**
         * Check if DB File exists
         *
         * @return TRUE if DB file was found / FALSE if not
         */
        private boolean doesDBExists()
        {
            this.dbFile = new File(this.dbPath);
            return this.dbFile.isFile();
        }

        /**
         * Open DB connection with SqlJet SQLite interface
         *
         * @return TRUE if DB connection could be established / FALSE if not
         */
        private boolean openDB()
        {
            try
            {
                db = DriverManager.getConnection("jdbc:sqlite:" + this.dbPath);

                return true;
            } catch (Exception e)
            {
                closeDB();
                e.printStackTrace();
                //System.exit(1000);
            }
            return false;
        }

        /**
         * Try to close the DB connection
         *
         * @return TRUE if DB connection could be closed / FALSE if not
         */
        private boolean closeDB()
        {
            try
            {
                this.db.close();
                return true;
            } catch (Exception e)
            {
                e.printStackTrace();
                //System.exit(1001);
            }
            return false;
        }

        /**
         * Execute the tank search query
         * @param argSQLWhereClause pre defined where clause for the tanks search query
         * @return ResultSet with all found tanks
         */
        private ResultSet getTanks(String argSQLWhereClause)
        {
            ResultSet queryResult = null;
            try
            {
                Statement dbStatement = db.createStatement();
                dbStatement.setQueryTimeout(30);
                String sqlQuery = "SELECT " + tankTableFields + " FROM " + tankTable + " WHERE " + argSQLWhereClause + " AND " + tankTableExclude;
                queryResult = dbStatement.executeQuery(sqlQuery);
                return queryResult;
            }catch(Exception e)
            {
                e.printStackTrace();
            }

            return queryResult;
        }

        /**
         * Get all Tanks by there nation
         *
         * @param argNation tank nation
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByNation(String argNation)
        {
           String sqlWhereClause = "Nation = '" + argNation + "'";
           return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there nation and class
         *
         * @param argNation tank nation
         * @param argClass  tank class
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByNationClass(String argNation, String argClass)
        {
            String sqlWhereClause = "Nation = '" + argNation + "' AND Class = '" + argClass + "'";
            return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there nation and tier
         *
         * @param argNation tank nation
         * @param argTier   tank tier
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByNationTier(String argNation, Integer argTier)
        {
            String sqlWhereClause = "Nation = '" + argNation + "' AND Tier = " + argTier;
            return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there class and tier
         *
         * @param argClass tank class
         * @param argTier  tank tier
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByClassTier(String argClass, Integer argTier)
        {
            String sqlWhereClause = "Class = '" + argClass + "' AND Tier = " + argTier;
            return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there nation, class and tier
         *
         * @param argNation tank nation
         * @param argClass  tank class
         * @param argTier   tank tier
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByNationClassTier(String argNation, String argClass, Integer argTier)
        {
            String sqlWhereClause = "Nation = '" + argNation + "' AND Class = '" + argClass + "' AND Tier = " + argTier;
            return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there class
         *
         * @param argClass tank class
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByClass(String argClass)
        {
            String sqlWhereClause = "Class = '" + argClass + "'";
            return this.getTanks(sqlWhereClause);
        }

        /**
         * Get all Tanks by there Tier
         *
         * @param argTier tank tier
         * @return ResultSet with all found Tanks
         */
        public ResultSet getTanksByTier(Integer argTier)
        {
            String sqlWhereClause = "Tier = " + argTier;
            return this.getTanks(sqlWhereClause);
        }

        public ResultSet getNations()
        {
            ResultSet queryResult = null;
            try
            {
                Statement dbStatement = db.createStatement();
                dbStatement.setQueryTimeout(30);
                String sqlQuery = "SELECT DISTINCT Nation FROM " + tankTable + " WHERE " + tankTableExclude;
                queryResult = dbStatement.executeQuery(sqlQuery);
                return queryResult;
            }catch(Exception e)
            {
                e.printStackTrace();
            }

            return queryResult;
        }

    }