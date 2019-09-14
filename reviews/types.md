<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> Variable Types </h1>
<p> There are many variable types. Variables can be divided into two basic kinds: </p>
	<ol>
		<li> primitive types </li>
		<li> object type </li>
	</ol>
<p> The priitive types can be divided into the following groups: </p>
		<dl>
			<dt>byte</dt>
			<dd> An integer type that ranges from -128 to 127 </dd>
			<dt>short</dt>
			<dd> An integer type that ranges from -32,768 to 32767 </dd>
			<dt>int </dt>
			<dd> An integer type that ranges from -2,147,483,648 - 2,147,483,647
			<dt>long</dt>
			<dd> An integer type that ranges from -9,223,372,036,854,775,808 - 9,223,372036,854,775,807 </dd>
			<dt>float</dt>
			<dd> A floating point number type ranging from plus or ninus 3.40282347E+38F 			
			<dt>double</dt>
			<dd> 1.79769313486231570E+308 </dd>
			<dt>char</dt>
			<dd> A character variable type that represents all Unicode characters. The char type can only store one character per variable </dd>
			<dt>boolean</dt>
			<dd>A truth-value variable type that stores the value <code>true</code> or <code>false</code></dd>
		</dl>
<p>
	Object types are defined by classes. Every time you define a class, you gain the ability to create variables of that class type. For instance, if you have a class named Eagle, you can declare and assign a variable of type <code> Eagle </code> with the following line:
</p>
<p>
	<code>Eagle bird = new Eagle();</code>
</p>
<p>
	This gives you a variable named bird of type Eagle which you can pass around your program just like any other variable.
</p>		
<p> The class for type Eagle might be defined as follows: </p>
<code>
	<pre>
public class Eagle{

	public double getSize(){
		return this.size;
	}

	public void setSize(double value){
		this.size = value;		
	}

	public String getName(){
		return this.name;
	}

	Public void setName(String value){
		this.name = value;
	}

	private double size;
	private String name;
}
</body>
</html>

