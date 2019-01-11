# Matrix Msu OpenRefine


#### This is a pre-alpha version of this code. Meaning somethings are completely missing.

***


This is the repository for the OpenRefine portion of the enslaved project suite's data import process.

We are trying to establish a method for enslaved users to be able to import their data with varying structures into a well defined wikidata structure. To do this we are exploring using a combination of a modified version of OpenRefine and a modified version of Quickstatements 2.0. The idea is that OpenRefine will map the data to the wikidata instance that matrix is running and then use Quickstatements for the import.

The main reason we need a modified version of OpenRefine is so that it can support additional functionality that we are adding to Quickstatements. Quickstatements does not support import jobs that have associations between data within the same import job. That is why we need to first modify Quickstatements and edit OpenRefine to support this additional functionality. 

A second more minor reason is the probability that some of the data that will be used is structured in a way that OpenRefine doesn't support for this flow. This way we can add support for specialized data cleaning within the OpenRefine import process.

There will likely be improvements or entire changes to this flow in the future as this is a multiple phase solution project.

The code is currently minorly different than OpenRefine's master so please refer to their documentation for install and use instructions.

Here is an outline of the current workflow:
-Select a single schemes csv file
-Use the multi-column cleaning tool
-Import
-Reconsile your labels columns to double check your data is new
-Mark which rows you want to be created as new items 
-Reconsile any columns that are values already inside of wikibase
-Create the Quickstatements wikibase schema
-Export to Quickstatements
-Go to Quickstatements and import your data into wikidata


***
***


#### Additional information from OpenRefine's github repository below

Download
-----------------------
* [OpenRefine Releases](https://github.com/OpenRefine/OpenRefine/releases)

Documentation and Videos
-------------------------
* [Documentation Wiki](https://github.com/OpenRefine/OpenRefine/wiki/Documentation-For-Users)
* [FAQ](https://github.com/OpenRefine/OpenRefine/wiki/FAQ)
* [Official Website and tutorial videos](http://openrefine.org)