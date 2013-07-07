package net.gesekus.osgitest.managerapi;

import java.util.List;

public interface TrackManager {
	boolean set(Track track);

	boolean remove(Integer id);

	List<Track> getAll();

	void registerListener(TrackLister trackLister);
}
