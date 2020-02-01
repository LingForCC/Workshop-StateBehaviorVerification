package cc.lingfor.state;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;

public class UploaderTest {


    @Test
    public void shouldUploadFileIfFileNotExistedAndStorageNotFull() {

        FileStub file = new FileStub(false, false);
        UploaderState uploader = new UploaderState(file);
        uploader.upload();
        assertEquals(true, uploader.isUploaded());
    }

    @Test
    public void shouldNotUploadFileIfFileExistedAndStorageNotFull() {

        FileStub file = new FileStub(true, false);
        UploaderState uploader = new UploaderState(file);
        
        assertEquals(false, uploader.isUploaded());
    }

    @Test
    public void shouldNotUploadFileIfFileNotExistedAndStorageIsFull() {

        FileStub file = new FileStub(false, true);
        UploaderState uploader = new UploaderState(file);
        
        assertEquals(false, uploader.isUploaded());
    }

    @Test
    public void shouldNotUploadFileIfFileExistedAndStorageIsFull() {

        FileStub file = new FileStub(true, true);
        UploaderState uploader = new UploaderState(file);
        
        assertEquals(false, uploader.isUploaded());
    }

}