package com.cos.myjpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.domain.song.SongRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SongService {

	private final SongRepository songRepository;

	
	public Song 노래저장하기(Song song) {	
		songRepository.save(song);
		return song;
		
	}
	
	
	public List<Song> 노래전체찾기(){
		List<Song> songList = songRepository.findAll();
		return songList;
	}
	
	
}
