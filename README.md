# MavenModuleTreeFinder

**Quick project to help you find the module tree of a maven project with multiple modules.**

To use this Project to find the Maven tree just open **MavenModuleTreeFinder.class** and set the rootPath property.
For the time being i have test this only in linux-ubuntu OS.

Example output:
<pre>
Root
  > legacy
  >  > CollectionRoot
  >  > CollectionRootAdHoc
  >  > CollectionRootCommon
  >  > CollectionRootWeb
  >  > RootForAskmeWeb
  >  > web
  >  >  > RootAskMeEARdev
  >  >  > RootAskMeEARprod
  >  >  > RootAskMeEARuat
  >  >  > RootAskMeWar
  >  >  > RootEARdev
  >  >  > RootEARprod
  >  >  > RootEARuat
  >  >  > RootWar
  > RootBo2
  >  > Root-IT
  >  > RootBo2Batch
  >  > RootBoAdhocReports
  >  > RootBoCommon
  >  > RootBoInterfaces
  >  >  > RootBoInterfaceBonus
  >  >  > RootBoInterfaceExternalSystem
  >  >  > RootBoInterfaceRha
  >  > RootBoJobs
  >  > RootEsBo
  >  > RootEsWeb
  >  > RootReports
  >  > cfg
  >  >  > DeplRootEs
  >  > web
  >  >  > RootEsEar
  >  >  > RootEsWar
  >  > wsExt
  >  >  > RootWsExternalClient
  >  >  > RootWsGenerated
  </pre>
