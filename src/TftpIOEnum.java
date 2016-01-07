/**
 * TFTP - IO ENUMS 
 * 
 * @author Aditya Kasturi
 * 
 */
public enum TftpIOEnum {
    NETASCII("netascii"),
    OCTET("octet"),
    MAIL("mail");

    private final String mode;

    TftpIOEnum(String type) {
        mode = type;
    }

    public String getValue() {
        return mode;
    }
}
