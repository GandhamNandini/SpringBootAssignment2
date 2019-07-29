package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exceptions.TrackAlreadyExists;
import com.stackroute.Muzix.exceptions.TrackNotFound;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExists, TrackAlreadyExists;

    public boolean deleteTrack(int id) throws TrackNotFound, TrackNotFound;

    public List<Track> getAllTracks() throws TrackNotFound;

    public Track getTrackById(int id) throws TrackNotFound;

    public boolean UpdateTrack(Track track) throws TrackAlreadyExists;

    public List<Track> getTrackByName(String name);

}
