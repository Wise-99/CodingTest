SELECT a.BOOK_ID, b.AUTHOR_NAME, date_format(a.PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from book as a, author as b
where  a.author_id = b.author_id and a.category = "경제"
order by a.PUBLISHED_DATE