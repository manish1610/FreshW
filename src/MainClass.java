import org.json.simple.JSONObject;

public class MainClass {

    static FileBasedKeyValueDB db;
    public static void main(String[] str) {
        try {
            db=new FileBasedKeyValueDB();

           testCreate();
             // testRead();
            //  testDelete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testCreate() throws KeyAlreadyExistsException, JSONSizeException, KeyLengthException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "KL Rahul");
        jsonObject.put("profession", "Cricketer");
        jsonObject.put("Nationality", "India");
        db.create("user2",jsonObject);

    }

    public static void testRead() throws KeyNotFoundException {

        JSONObject json=db.readJSONObject("user2");
        System.out.println(json);


    }

    public static void testDelete() throws KeyNotFoundException {

        db.delete("user2");

    }
}
