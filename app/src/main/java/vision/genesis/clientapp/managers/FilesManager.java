package vision.genesis.clientapp.managers;

import java.io.File;

import io.swagger.client.api.FileApi;
import io.swagger.client.model.UploadResult;
import rx.Observable;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 05/07/2018.
 */

public class FilesManager
{
	private FileApi fileApi;

	public FilesManager(FileApi fileApi) {
		this.fileApi = fileApi;
	}

	public Observable<UploadResult> uploadFile(File file) {
		//TODO: fix
//		return fileApi.v10FileUploadPost(RequestBody.create(MediaType.parse("multipart/form-data"), file));
		return null;
	}
}
