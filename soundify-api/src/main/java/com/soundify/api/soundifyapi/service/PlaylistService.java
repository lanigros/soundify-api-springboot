package com.soundify.api.soundifyapi.service;

import com.soundify.api.soundifyapi.model.Playlist;
import com.soundify.api.soundifyapi.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    private final PlaylistRepository playlistRepository;
    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository= playlistRepository;
    }

    public void addPlaylist(Playlist playlist){
        playlistRepository.insert(playlist);
    }

    public void updatePlaylist(){ }

    public List<Playlist> getAllPlaylist(){
        return playlistRepository.findAll();
    }

    public void getPlaylist(){ }

    public void deletePlaylist(){ }
}