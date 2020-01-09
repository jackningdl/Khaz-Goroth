package main

import "fmt"

// 创建一个 structure
type person struct {
	name   string
	age    int
	gender string
}

// 嵌套 structure
type secretAgent struct {
	person
	licenseToKill bool
}

func (p person) speak() {
	fmt.Println(p.name, "says, My age is", p.age, ".")
}

func (sa secretAgent) speak() {
	fmt.Println(sa.name, `says, "Shaken, not stirred."`)
}

// 多态
type human interface {
	speak()
}

func saySomething(h human) {
	h.speak()
}

func main() {
	p1 := person{
		"Brad Pitt",
		45,
		"male",
	}

	sa1 := secretAgent{
		person{
			"James Bond",
			62,
			"male",
		},
		true,
	}
	saySomething(p1)
	saySomething(sa1)
}
