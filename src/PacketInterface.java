
/**
 *  The packet Interface which is used to implement the block number
 *  method
 * 
 * @author Aditya Kasturi
 */
public interface PacketInterface {
    
	/**
     * Get the block number to acknowledge
     * @return Block Number >= 0
     */
    public short getBlockNumber();
    
}