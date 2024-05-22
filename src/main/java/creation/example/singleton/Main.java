package creation.example.singleton;

public class Main {
    public static void main(String[] args) {

      //  Servers server = new Servers();
        // cand am in clasa constructor cu parametrii cel default este anulat;


        Servers.getInstance() ;
        Servers server1 = Servers.getInstance();
        Servers server2 = Servers.getInstance();

       // System.out.println(server1);
      //  System.out.println(server2);

        server1.addServer("http://");
        //System.out.println(server1);

        server2.addServer("https//");
       // System.out.println(server2);
        //System.out.println(server1);

        server2.downloadHttp();
        System.out.println(server2.downloadHttps());
    }
}
