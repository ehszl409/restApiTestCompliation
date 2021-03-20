package com.cos.myjpa;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cos.myjpa.domain.song.CategoryType;
import com.cos.myjpa.domain.song.Lyrics;
import com.cos.myjpa.domain.song.Song;
import com.cos.myjpa.domain.song.SongRepository;

@SpringBootApplication
public class MusictestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusictestApplication.class, args);
		
	}
	
	
	@Bean
	public CommandLineRunner dataInit(SongRepository songRepository) {
		
		String lyrics1 = "눈을 감으면 태양의 저 편에서 들려오는 멜로디\n"
				+ "내게 속삭이지 이제 그만 일어나 어른이 될 시간이야\n"
				+ "너 자신을 시험해 봐 길 을 떠나야 해\n"
				+ "니가 흘린 눈물이\n"
				+ "마법의 주문이 되어 너의 여린 마음을 자라나게 할거야\n"
				+ "남들이 뭐래도 네가 믿는 것들을 포기하려 하거나 움츠려\n"
				+ "들지만 힘이 들 땐\n"
				+ "절대 뒤를 돌아보지마 앞만 보며 날아가야 해\n"
				+ "너의 꿈을 비웃는 자는 애써 상대 하지마 변명하려\n"
				+ "입을 열지마 그저 웃어 버리는 거야 아직 시간이 남아있어\n"
				+ "너의 날개는 펴질거야\n"
				+ "Now we are flying to the universe\n"
				+ "마음이 이끄는 곳 높은 곳으로 날아가\n"
				+ "절대 뒤를 돌아보지마 앞만 보며 날아가야 해\n"
				+ "너의 꿈을 비웃는 자는 애써 상대하지마 변명하려\n"
				+ "입을 열지마 그저 웃어 버리는 거야 아직 시간이 남아있어\n"
				+ "너의 날개는 펴질거야 더 높이\n"
				+ "더 멀 리 너의 별을\n"
				+ "찾아 날아라\n"
				+ "소년아, 저 모든 별들은 너보다 먼저 떠난\n"
				+ "사람들이 흘린 눈물이란다 세상을 알게 된 두려움에\n"
				+ "흘린 저 눈물이 이 다음 에 올 사람들을 인도하고 있는 것이지";
		
		
		
		return (args) -> {
			// 데이터 초기화 하기
			songRepository.saveAll(Arrays.asList(
					new Song(null, "해에게서 소년에게", "N.E.X.T", CategoryType.ROCK, 10000, lyrics1, "1997. 11", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F2451334B573419A20E", "N.E.X.T - 해에게서 소년에게.mp3")
					
//					new Person("홍길동", "프로그래머", "0102222"),

					)
			);
		};
	}
}