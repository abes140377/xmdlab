package org.xmdlab.cartridge.common.io

import com.google.inject.Inject

public class GenFile {
	
	@Inject OutputConfigurationAwareFileSystemAccess fsa;
	
	@Inject IFileSystemAccessUtil fsaUtil;
	
	/**
	 * 
	 */
	def public void generateFile(String fileName, CharSequence contents) {
        //Assert.isNotNull(fsa, "Need to set IFileSystemAccess first");
        val exists = fsaUtil.fileExists(fsa, OutputConfigurationAwareFileSystemAccess.DEFAULT_OUTPUT, fileName)
        fsa.generateFile(fileName, OutputConfigurationAwareFileSystemAccess.DEFAULT_OUTPUT, contents);
    }
    
    /**
     * 
     */
    def public void generateFile(String fileName, String outputConfig, CharSequence contents) {
        //Assert.isNotNull(fsa, "Need to set IFileSystemAccess first");
        val exists = fsaUtil.fileExists(fsa, outputConfig, fileName)
        fsa.generateFile(fileName, outputConfig, contents);
    }
}