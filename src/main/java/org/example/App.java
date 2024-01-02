package org.example;

import org.example.Config.HibernateConfig;
import org.example.Entity.Programmer;
import org.example.Entity.Project;
import org.example.Service.MyService;
import org.example.Service.ServiceImpl.ProgrammerServiceImpl;
import org.example.Service.ServiceImpl.ProjectServiceImpl;

import java.math.BigDecimal;

public class App {
    public static void main( String[] args ) {

        MyService<Programmer,Long> programmerMyService  = new ProgrammerServiceImpl();
        MyService<Project,Long> projectMyService = new ProjectServiceImpl();
        Programmer programmer = new Programmer();

      Programmer programmer1 = Programmer.builder().
                fullName("SYIMYK ULUKBEK UULU")
                .email("SU@gmail.com")
                .salary(BigDecimal.valueOf(2000)).build();
      programmerMyService.save(programmer1);

   Project project = Project.builder().
            name("LMS")
            .description("For students").build();
   projectMyService.save(project);
    }
}
