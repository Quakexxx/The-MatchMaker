import java.sql.ResultSet;

/**
 * Created with IntelliJ IDEA.
 * User: Besitzer
 * Date: 01.04.13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class testDBInterface {

    public static void main(String[] args) {
        try
        {
            dbInterface db = new dbInterface("E:/Dokumente und Einstellungen/Besitzer/IdeaProjects/untitled/tanks.sqlite");
            ResultSet tanks = db.getTanksByNation("American");
            while(tanks.next())
            {
                System.out.println(tanks.getString("Name") + " (Tier: " + tanks.getInt("Tier") + "; Class: " + tanks.getString("Class") + ")");
            }

            System.out.println();

            ResultSet nations = db.getNations();
            while(nations.next())
            {
                System.out.println(nations.getString("Nation"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
