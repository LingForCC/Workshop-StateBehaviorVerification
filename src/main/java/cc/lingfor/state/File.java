package cc.lingfor.state;

public class File {

    private boolean _isUploaded;

    public boolean isUploaded() {
        return this._isUploaded;
    }

    public void upload() {
        //check if the file is existing
        //check if the file is already uploaded
        //upload the file
        this._isUploaded = true;
    }
}