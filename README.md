# OpenRefine

[![Join the chat at https://gitter.im/OpenRefine/OpenRefine](https://badges.gitter.im/OpenRefine/OpenRefine.svg)](https://gitter.im/OpenRefine/OpenRefine?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) [![Build Status](https://travis-ci.org/OpenRefine/OpenRefine.png?branch=master)](https://travis-ci.org/OpenRefine/OpenRefine) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/210578308bba42c5922c767493e83cf4)](https://www.codacy.com/app/OpenRefine/OpenRefine) [![Codacy Badge](https://api.codacy.com/project/badge/Coverage/210578308bba42c5922c767493e83cf4)](https://www.codacy.com/app/OpenRefine/OpenRefine) [![Translation progress](https://hosted.weblate.org/widgets/openrefine/-/svg-badge.svg)](https://hosted.weblate.org/engage/openrefine/?utm_source=widget)

OpenRefine is a Java-based power tool that allows you to load data, understand it,
clean it up, reconcile it, and augment it with data coming from
the web. All from a web browser and the comfort and privacy of your own computer.

[<img src="https://github.com/OpenRefine/OpenRefine/blob/master/graphics/icon/open-refine-320px.png" align="right">](http://openrefine.org)

Download
-----------------------
* [OpenRefine Releases](https://github.com/OpenRefine/OpenRefine/releases)

Run from source
------------------
If you have cloned this repository to your computer, you can run OpenRefine with:
* `./refine` on Mac OS and Linux
* `refine.bat` on Windows

Wikidata Extension Configuration
------------------
Wikidata uses specific configuration files to point to different wiki installations,
keep in mind there are two; one for Java and the other for Javascript. After editing Openrefine
needs to be rebuilt.
* `cp extensions/wikidata/wikidata.properties.sample extensions/wikidata/wikidata.properties` for Java
* `cp extensions/wikidata/module/scripts/config.js.sample extensions/wikidata/module/scripts/config.js` for Javascript


This requires JDK 8 and Apache Maven.

Documentation and Videos
-------------------------
* [Documentation Wiki](https://github.com/OpenRefine/OpenRefine/wiki/Documentation-For-Users)
* [FAQ](https://github.com/OpenRefine/OpenRefine/wiki/FAQ)
* [Official Website and tutorial videos](http://openrefine.org)

Contributing to the project
---------------------------
* [Developers Guide & Architecture](https://github.com/OpenRefine/OpenRefine/wiki/Documentation-For-Developers)
* [Contributing Guide](https://github.com/OpenRefine/OpenRefine/blob/master/CONTRIBUTING.md)
* [Project Governance](https://github.com/OpenRefine/OpenRefine/blob/master/GOVERNANCE.md)

Contact us
----------
* [Mailing List](https://groups.google.com/forum/#!forum/openrefine)
* [Twitter](http://www.twitter.com/openrefine)

Licensing and legal issues
--------------------------
OpenRefine is open source software and is licensed under the BSD license
located in the [LICENSE.txt](LICENSE.txt). See the folder `licenses` for information on open source
libraries that OpenRefine depends on.

Credits
-------
This software was created by Metaweb Technologies, Inc. and originally written
and conceived by David Huynh <dfhuynh@google.com>. Metaweb Technologies, Inc.
was acquired by Google, Inc. in July 2010 and the product was renamed Google Refine.
In October 2012, it was renamed OpenRefine as it transitioned to a
community-supported product.

See `AUTHORS.md` for the list of OpenRefine contributors.
