package cc.lingfor.state;

public class FileStub extends File {

    public FileStub(boolean isExistingOnServer, boolean isStorageFull) {
        this.isExistingOnServer = isExistingOnServer;
        this.isStorageFull = isStorageFull;
        this.isUploaded = false;
    }

    @Override
    public void upload() {
        this.isUploaded = true;
        this.isExistingOnServer = true;
        this.isStorageFull = false;
    }

}