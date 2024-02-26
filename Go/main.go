package main

import "fmt"

func main() {
	var firstName string
	var lastName string
	var email string
	const conferenceName string = "Go Conference"

	var tickets uint
	var ticketBooked uint
	var ticketsRemaining uint

	fmt.Println("Hello Users!")
	fmt.Println("Enter Your First name: ")
	fmt.Scan(&firstName)
	fmt.Println("Enter your Last name: ")
	fmt.Scan(&lastName)
	fmt.Println("Enter your Email: ")
	fmt.Scan(&email)
	fmt.Println("Enter the number of tickets you want to book: ")
	fmt.Scan(&ticketBooked)

	tickets = 50
	ticketsRemaining = tickets - ticketBooked

	fmt.Println("Welcome to", conferenceName, "ticket booking application")
	fmt.Println("Hello ", firstName, " ", lastName, " Your Email address is ", email, ".")
	fmt.Printf("You have Booked %v tickets, Tickets remaining %v\n", ticketBooked, ticketsRemaining)
	fmt.Printf("Thanks %v %v for booking %v tickets you will be reciving a conformation message on your email %v", firstName, lastName, ticketBooked, email)
}
