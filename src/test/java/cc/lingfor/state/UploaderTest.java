package cc.lingfor.state;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;

public class UploaderTest {

    
    private UploaderState uploader;

    @Before
    public void setUp() {
        uploader = new UploaderState();
    }


    @Test
    public void shouldUploadFileIfFileNotExisted() {

        FileStub file = new FileStub(false, false);

        uploader.upload(file);
        
        assertEquals(true, file.isUploaded());
    }

    @Test
    public void shouldNotUploadFileIfFileExisted() {

        FileStub file = new FileStub(true, false);

        uploader.upload(file);
        
        assertEquals(false, file.isUploaded());
    }

    // @Test
    // public void shouldNotUploadFileIfFileUploaded() {

    //     FileStub file = new FileStub(true, true);

    //     uploader.upload(file);
        
    //     assertEquals(false, file.isUploaded());
    // }

}