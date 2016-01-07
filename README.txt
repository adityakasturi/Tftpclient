READ ME - TFTP Client (RFC - 1350)
by 
Aditya Kasturi


Description :                                        
Trivial File transfer protocol, popularly known as TFTP is a very simple protocol used to transfer files. TFTP is normally used when we there is a need to copy a file without the overhead of features of FTP, i.e., File Transfer Protocol. For example, we would be to fetch bootstrap and configuration files when a diskless workstation is booted. TFTP is used in applications we need quick copying of files. TFTP uses UDP as the underlying protocol for communication. 


Instructions to run the code :
1. Environment requirement to run the code - Java 1.7 in any Operating System.
2. Open the terminal.
3. Move to the corresponding folder, where the TFTP application is present.
4. Move to bin folder
5. Run the following command in terminal 
   1. java tftp
Running the application:
1. You need to mention a TFTP Server address - By Default the port number for TFTP application is 69. So in the UI the port number is set to 69.
2. After the Server Address is entered here, you can specify the file you want to send or the file want to receive.
3. The TFTP Application will then Make a Read Request or Write Request to the Server.
4. After the Request is completed. You can save the file after reading, or quit after writing on the server.