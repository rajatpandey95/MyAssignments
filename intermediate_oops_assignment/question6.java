package intermediate_oops_assignment;

abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence {
    @Override
    public String persist() {
        return "FilePersistence Called,   Data being saved in File";
    }
}

class DatabasePersistence extends Persistence {
    @Override
    public String persist() {
        return "DatabasePersistence Called,   Data being saved in Database";
    }
}

class Client {
    public void saveData(Persistence obj) {
        System.out.println(obj.persist());
    }
}

public class question6 {
    public static void main(String[] args) {

        Persistence filePerObj = new FilePersistence();
        Persistence databasePerObj = new DatabasePersistence();

        Client clientObj = new Client();
        clientObj.saveData(filePerObj);

        clientObj.saveData(databasePerObj);

    }
}
