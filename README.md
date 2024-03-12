# Search and Chips Library for Android ` kotlin`
###
### Welcome to the Search and Chips Library, a Kotlin-based Android library designed to simplify the process of searching for items and creating chips for selection.
# `Overview`
* The Search and Chips Library provides a custom view called `<com.example.searchandchips.library.search.Search_and_Chips />.`
*  This view integrates seamlessly into your Android applications,
*   offering users a convenient way to search for items and select them through the creation of chips.
##  Key Features
* Search Functionality: Users can easily search for items within a designated list.
* Chip Creation: Upon selecting an item from the search results, a chip is dynamically created below the search bar, visually indicating the selected item.
* Multiple Selections: Users can select multiple items, resulting in the creation of multiple chips for each selection.
* Chips ArrayList: The library offers access to the selected items through an ArrayList of chips, enabling developers to utilize the selected items as needed.
## How to

To integrate the Search and Chips Library into your project using JitPack, follow these steps:

## Step 1: Add the JitPack repository to your build file
Gradle:
```
allprojects {
    repositories {
        // Other repositories
        maven ( url ="https://jitpack.io" )
    }
}
```
## Step 2: Add the dependency
```
dependencies {
    implementation ("com.github.yusufkhan08070817:SearchAndChips:Tag")
}
```
### current version ` 1.0.1 `
## Usage
### Here's a quick guide to using the Search and Chips Library:
* Implement the Search_and_Chips view within your layout XML
* Configure the library by providing the list of searchable items.
* Allow users to search for items and select them by clicking on the search results.
* Retrieve the selected items using the provided ArrayList of chips for further processing or display.

#Example

```

        val randomWords = listOf(// data from user serch this is an example you can get data from api 
            "apple",
            "banana",
            "orange",
            "grape",
            "kiwi",
            "pear",
            "melon",
            "pineapple",
            "strawberry",
            "blueberry",
            "raspberry",
            "blackberry",
            "cherry",
            "peach",
            "apricot",
            "plum",
            "mango",
            "papaya",
            "lime",
            "lemon"
        )
        
        repeat(100) {
            val randomIndex = (0 until randomWords.size).random()
            Data.data.add(randomWords[randomIndex])
        }

        
        val serc = serch(this)
        serc.init()
```

# Contribution
Contributions to the Search and Chips Library are welcome! Whether you'd like to report a bug, suggest an enhancement, or submit a pull request, your involvement is appreciated.
# License
This library is licensed under the MIT License, permitting usage and modification within non-profit projects.

Please ensure that you abide by the terms of the MIT License and utilize the library responsibly within non-profit endeavors.
