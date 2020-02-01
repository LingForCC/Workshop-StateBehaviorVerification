package cc.lingfor.state;

public class UploaderState {

    private File file;

    public UploaderState(File file) {
        this.file = file;
    }

    public boolean isUploaded() {
        return this.file.isUploaded();
    }

    public void upload(){
        if(!this.file.isExistingOnServer() && !this.file.isStorageFull()) {
            this.file.upload();
        }
    }
}