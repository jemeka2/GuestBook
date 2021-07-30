Guest Book:

---------------------
Controller.java
---------------------
Begin
	Create an ArrayList(guests)
	Create and Initalize a idCounter
	
	RequestMapping(home)
	create a method homePage
		Return the home.html
	
	GetMapping(newGuest)
	Create a new guest
	add new guest to model
	return newGuest.html
	
	PostMapping(confirmPost)
	if the java bean has an error
		return newGuest page
	else
		add guest to ArrayList guest
		return confirmPost.html
	
	RequestMapping
	Create a new guest
	add new guest to model
	return post.html

	Create private method that adds 1 to idCounter

End

---------------------
Guest.java
---------------------
Begin
	Create private variables
	create getters and setters for private variables
End

---------------------
base.html
---------------------
Begin
	Create a navbar
	fragment navbar

	create a footer
	fragment footer

	style footer 
	fragment style
End

---------------------
home.html
---------------------
Begin
	create div with fullscreen img background

	replace div with navbar fragment

	style background and navbar

	add text to middle of screen

	replace div with footer fragment
End

---------------------
newGuest.html
---------------------
Begin
	create div with navbar fragment
	
	create form that gets user input
	
	store user input in Guest.java variables

	create div with footer fragment
End

---------------------
confirmPost.html
---------------------
Begin
	create div with navbar fragment
	
	display user input in card
	
	create div with footer fragment
End

---------------------
posts.html
---------------------
Begin
	create div with navbar fragment
	
	display full arraylist of posts in seperate cards

	create div with footer fragment
End
	

