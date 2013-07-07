package net.gesekus.osgitest.managerimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.gesekus.osgitest.managerapi.Track;
import net.gesekus.osgitest.managerapi.TrackLister;
import aQute.bnd.annotation.component.Component;

@Component
public class TrackManager implements net.gesekus.osgitest.managerapi.TrackManager {

  Map<Integer, Track> trackMap = new HashMap<Integer, Track>();

  @Override
  public boolean set(Track track) {
    boolean isUpdate = false;
    if (trackMap.containsKey(track.getId())) {
      isUpdate = true;
    }
    trackMap.put(track.getId(), track);
    return isUpdate;
  }

  @Override
  public boolean remove(Integer id) {
    trackMap.remove(id);
    return false;
  }

  @Override
  public List<Track> getAll() {
    return new ArrayList<>(trackMap.values());
  }

  @Override
  public void registerListener(TrackLister trackLister) {
  }

}
