package com.raonse2.pms;

import com.raonse2.pms.model.Emp;
import com.raonse2.pms.repository.EmpRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class PmsApplication{
    public static void main(String[] args) {
        //2021-04-12 sjseo 추가
        //2021-04-12 gdkim 추가
        //되라 2
        SpringApplication.run(PmsApplication.class, args);
    }
    @Bean
    public CommandLineRunner Member(EmpRepository repository) {
        return (args) -> {
            //엔티티 생성
            Emp emp1 = new Emp();
            Emp emp2 = new Emp();
            Emp emp3 = new Emp();

            emp1.setEmpno(1);
            emp1.setEname("김기덕");
            emp2.setEmpno(2);
            emp2.setEname("서석준");
            emp3.setEmpno(3);
            emp3.setEname("김심평원프로님");
            //엔티티 저장
            repository.save(emp1);
            repository.save(emp2);
            repository.save(emp3);

            //엔티티 조회
            for(Emp m : repository.findAll()) {
                System.out.println("회원 명 : {}" + m.getEmpno());
            }

            //엔티티 삭제
            repository.delete(emp2);

            for(Emp m : repository.findAll()) {
                System.out.println("회원 명 : {}" + m.getEmpno());
            }
        };
    }
}
