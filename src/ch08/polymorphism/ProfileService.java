package ch08.polymorphism;

public class ProfileService {
    ProfileRepository repository;

    public void saveProfile() {
        // 만약 다른 저장소가 추가된다면 이 부분(객체 생성자)만 바꿔 끼우면 됨
        repository = new ProfileDBRepository();
        repository.save();
    }
}
