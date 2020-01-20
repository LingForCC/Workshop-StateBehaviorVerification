package cc.lingfor.state;

public class File {

    protected boolean isUploaded;
    protected boolean isExistingOnServer;

    public boolean isUploaded() {
        return this.isUploaded;
    }

    public boolean isExistingOnServer() {
        return isExistingOnServer;
    }

    public void init(String filePath, byte[] data) {
        //check if the file exists on server

        // set isExistingOnServer
    }

    public void upload() {
        //upload the file
        
        // set isUploaded
    }
}