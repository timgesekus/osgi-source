package net.gesekus.osgitest.managerapi;

public interface TrackLister {
	void trackAdded(Track track);
	void trackUpdated(Track track);
	void trackRemoved(Integer id);
}
