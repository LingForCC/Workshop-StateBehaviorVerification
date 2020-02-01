package cc.lingfor.state;

public class UploaderState {

    private File file;
    private boolean isUploaded;

    public UploaderState(File file) {
        this.file = file;
        isUploaded = this.file.isUploaded();
    }

    public boolean isUploaded() {
        return this.isUploaded;
    }

    public void upload(){
        if(!this.file.isExistingOnServer() && !this.file.isStorageFull()) {
            this.file.upload();
            this.isUploaded = this.file.isUploaded();
        }
    }
}