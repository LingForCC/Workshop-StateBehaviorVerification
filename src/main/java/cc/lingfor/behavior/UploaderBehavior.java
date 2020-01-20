package cc.lingfor.behavior;

public class UploaderBehavior {

    private FileService fileService;

    public UploaderBehavior(FileService fileService) {
        this.fileService = fileService;
    }

    public void upload(String filePath, byte[] data){
        if(!this.fileService.isFileExisted(filePath)) {
            this.fileService.upload(filePath, data);
        }
    }
}