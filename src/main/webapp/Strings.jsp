<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL functions Demo</title>
</head>
<body>
	<a href="jstlDemo.jsp"> back</a><br>
	<h1>JSTL String Functions</h1>
	<c:set var="str1" value="word1 word2 word3 word4 word5 word6 word7 word8 word9"/>
	<h3>Sentence:</h3>
	<c:out value="${str1}"/>
	<p>Length of sentence: ${fn:length(str1)}</p>
	<c:set var="strArr" value="${fn:split(str1,' ') }"/>
	<p>List of words:</p>
	<ol>
		<c:forEach items="${strArr}" var='word'>
				<li>
					"${word}"
				</li>
		</c:forEach>
	</ol>
	<c:set var="searchedWord" value="${param.word}"/>
	<c:choose>
		<c:when test="${searchedWord == null || searchedWord == '' }">
			<p>No searched word!</p>
		</c:when>
		<c:when test="${fn:contains(str1, searchedWord)}">
			<p>Sentence contains searched word "${searchedWord}"</p>
			<p>Index of searched string in the sentence is "${fn:indexOf(str1,searchedWord)}"</p>
			<c:choose>
				<c:when test="${fn:startsWith(str1, searchedWord)}">
					<p>Sentence starts with searched word "${searchedWord}"</p>
				</c:when>
				<c:when test="${fn:endsWith(str1, searchedWord)}">
					<p>Sentence ends with searched word "${searchedWord}"</p>
				</c:when>
				<c:otherwise>
					<p>"${searchedWord}", is not in beginning or end of the sentence.</p>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<p>"${searchedWord}", is not found in the sentence.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>