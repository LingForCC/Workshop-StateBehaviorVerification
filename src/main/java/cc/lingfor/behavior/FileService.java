package cc.lingfor.behavior;

public interface FileService {

    public boolean isFileExisted(String filePath);

    public boolean isStorageFull();

    public boolean upload(String filePath, byte[] data);

}