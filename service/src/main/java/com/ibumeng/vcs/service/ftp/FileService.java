package com.ibumeng.vcs.service.ftp;

import java.io.File;
import java.io.IOException;

public interface FileService {

	public String put(File file) throws IOException;

    public String newname(String filename);

    public String basename(String filename);
}
