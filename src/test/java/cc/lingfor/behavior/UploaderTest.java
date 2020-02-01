package cc.lingfor.behavior;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;

public class UploaderTest {

    
    private UploaderBehavior uploader;
    private FileService fileService;

    @Before
    public void setUp() {
        fileService = mock(FileService.class);
        uploader = new UploaderBehavior(fileService);
    }


    @Test
    public void shouldUploadFileIfFileNotExistedAndStorageNotFull() {

        byte[] data = new byte[] {};
        String filePath = "filePath";
        given(fileService.isFileExisted(filePath)).willReturn(false);
        given(fileService.isStorageFull()).willReturn(false);

        uploader.upload(filePath, data);

        verify(fileService, times(1)).upload(filePath, data);
    }

    @Test
    public void shouldNotUploadFileIfFileExistedAndStorageNotFull() {

        byte[] data = new byte[] {};
        String filePath = "filePath";
        given(fileService.isFileExisted(filePath)).willReturn(true);
        given(fileService.isStorageFull()).willReturn(false);

        uploader.upload(filePath, data);

        verify(fileService, times(0)).upload(filePath, data);
    }

    @Test
    public void shouldNotUploadFileIfFileNotExistedAndStorageFull() {

        byte[] data = new byte[] {};
        String filePath = "filePath";
        given(fileService.isFileExisted(filePath)).willReturn(false);
        given(fileService.isStorageFull()).willReturn(true);

        uploader.upload(filePath, data);

        verify(fileService, times(0)).upload(filePath, data);
    }

    @Test
    public void shouldNotUploadFileIfFileExistedAndStorageFull() {

        byte[] data = new byte[] {};
        String filePath = "filePath";
        given(fileService.isFileExisted(filePath)).willReturn(true);
        given(fileService.isStorageFull()).willReturn(true);

        uploader.upload(filePath, data);

        verify(fileService, times(0)).upload(filePath, data);
    }

}