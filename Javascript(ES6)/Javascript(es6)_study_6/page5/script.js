const numbers = [1, 2, 3, 4];
const doubledNumbers = numbers.map((number)=>{
  return number*2;
});
console.log(doubledNumbers);
// Create a new array in the numbers constant by using the map method, and assign it to the doubledNumbers constant


// Print the doubledNumbers constant



const names = [
  {firstName: "Kate", lastName: "Jones"},
	{firstName: "John", lastName: "Smith"},
	{firstName: "Dennis", lastName: "Williams"},
	{firstName: "David", lastName: "Black"}
];

const fullNames = names.map((name)=>{
  return name.firstName + " " + name.lastName;
});
console.log(fullNames);
// Create a new array in the names constant by using the map method, and assign it to the fullNames constant


// Print the fullNames constant

