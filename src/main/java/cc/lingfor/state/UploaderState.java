package cc.lingfor.state;

public class UploaderState {
    public void upload(File file){
        if(!file.isExistingOnServer()) {
            file.upload();
        }
    }
}