package com.bicat.semver.maven.plugin.goal;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import com.bicat.semver.maven.plugin.SemverMavenPlugin;

@Mojo( name = "patch")
public class SemverMavenPluginGoalPatch extends SemverMavenPlugin {

  
  public void execute() throws MojoExecutionException, MojoFailureException {
    System.out.println("PATCH version created");
  }

}
