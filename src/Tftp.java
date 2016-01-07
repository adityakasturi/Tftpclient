
/**
 * The Main class of the application which is used to run the TFTP Client
 * 
 * @author Aditya Kasturi
 */
public class Tftp {
	
	
    public static void main(String[] args) {
        if(args.length == 0){
            launchUI();
        }else{
            checkArgs(args);
        }
    }

    private static void launchUI() {
        new TftpClientUI().setVisible(true);
    }

    private static void checkArgs(String[] args) {

    }    
    
}
