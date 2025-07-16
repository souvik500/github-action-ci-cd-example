package com.javaTeche.github_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionForCiCdApplication {

	@GetMapping
	public String welcome() {
		return "Welcome to GitHub Action for CI/CD ";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionForCiCdApplication.class, args);
	}

//	echo "# github-action-ci-cd-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/souvik500/github-action-ci-cd-example.git
//	git push -u origin main
}
