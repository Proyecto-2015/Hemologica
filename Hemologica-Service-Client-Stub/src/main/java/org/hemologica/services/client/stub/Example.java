package org.hemologica.services.client.stub;

import java.nio.file.Path;

import com.darylteo.nio.DirectoryChangedSubscriber;
import com.darylteo.nio.DirectoryWatcher;
import com.darylteo.nio.ThreadPoolDirectoryWatchService;

public class Example {
	public static void main(String[] args) {
		
		try{
		// Get Watcher
		ThreadPoolDirectoryWatchService factory = new ThreadPoolDirectoryWatchService(); // or
																							// PollingDirectoryWatchService
		DirectoryWatcher watcher = factory.newWatcher("/home/bruno/Descargas/prueba/");

		// Configure
		watcher.include("*");

		// Subscribe
		watcher.subscribe(new DirectoryChangedSubscriber() {
			
			@Override
			public void directoryChanged(DirectoryWatcher watcher, Path path) {
				System.out.println("Something changed! " + path.toString());
			}

		});

		// Cleanup
		factory.close();
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}