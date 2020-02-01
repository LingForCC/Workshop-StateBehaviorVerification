package cc.lingfor.behavior;

public class FileServiceImpl implements FileService {

    @Override
    public boolean isFileExisted(String filePath) {
        //check if the file existed
        return false;
    }

    @Override
    public boolean isStorageFull() {
        return false;
    }

    @Override
    public void upload(String filePath, byte[] data) {
        //do upload
    }
}