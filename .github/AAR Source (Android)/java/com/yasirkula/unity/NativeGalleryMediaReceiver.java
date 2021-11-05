package com.devmastery.unity;

/**
 * Created by devmastery on 23.02.2018.
 */

public interface NativeGalleryMediaReceiver
{
	void OnMediaReceived( String path );
	void OnMultipleMediaReceived( String paths );
}
