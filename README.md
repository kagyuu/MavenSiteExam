# MavenSiteExam
An example for maven site plugin and multi-module.

```
$ mvn clean jacoco:prepare-agent test site
$ mvn javancss:report  // re-run javancss:report to aggreage line counts.
$ mvn site:stage // gather site htmls to parent project
```

The jacoco worked perfectly for each sub project, but agrregating jacoco's code coverage to the parent site report is not work.
I don't know what can I do.
