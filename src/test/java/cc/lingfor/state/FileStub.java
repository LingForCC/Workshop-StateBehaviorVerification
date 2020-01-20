package cc.lingfor.state;

public class FileStub extends File {

    public FileStub(boolean isExistingOnServer, boolean isUploaded) {
        this.isExistingOnServer = isExistingOnServer;
        this.isUploaded = isUploaded;
    }

    @Override
    public void upload() {
        this.isUploaded = true;
    }

}