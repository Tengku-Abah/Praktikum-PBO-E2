public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("indra");
        DAOManager a = new DAOManager();
        a.setPersonDAO(new MySQLPersonDAO());
        try {
            a.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
