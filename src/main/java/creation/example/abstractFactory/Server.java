package creation.example.abstractFactory;


public class Server extends Computer {


    private Integer rampercomp;
    private Integer hddPerComponent;
    private  Integer numberofcomp;

    public Server(Integer rampercomp, Integer hddPerComponent, Integer numberofcomp) {
        this.rampercomp = rampercomp;
        this.hddPerComponent = hddPerComponent;
        this.numberofcomp = numberofcomp;
    }

    @Override
    public String getRam() {
        return "ram server : " + rampercomp * numberofcomp;
    }

    @Override
    public String getHardDisk() {
        return "hard disk server: " + hddPerComponent * numberofcomp;
    }
}
