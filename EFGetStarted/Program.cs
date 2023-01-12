using System;
using System.Linq;

using (BloggingContext db = new BloggingContext())
{
    Console.WriteLine("Inserting data");
    db.Add(new Blog { Url = "http://blogs.msdn.com/adonet" });
    db.Add(new Blog { Url = "http://google/blog" });
    db.Add(new Blog { Url = "http://blog.yahoo.com" });
    db.Add(new Blog { Url = "http://blog.pt.microsoft.com" });

    db.SaveChanges();
}

using (BloggingContext db = new BloggingContext())
{
    var blog = db.Blogs.Find(2);
    Console.WriteLine($"Updating the blog {blog.Url} and adding a post");

    blog.Url = "https://devblogs.google.com/new";
    db.SaveChanges();
}

using (BloggingContext db = new BloggingContext())
{
    var blog = db.Blogs.Find(4);
    Console.WriteLine($"Delete the blog {blog.Url}");
    db.Remove(blog);
    db.SaveChanges();
}

using (BloggingContext db = new BloggingContext())
{
    Console.WriteLine("Method Sintax");

    var blogs = db.Blogs.ToList();

    blogs.ForEach(b => Console.WriteLine($" URL: {b.Url} "));
}

using (BloggingContext db = new BloggingContext())
{
    Console.WriteLine("Query Sintax");

    var blogs = (from e in db.Blogs select e).ToList();

    blogs.ForEach(b => Console.WriteLine($" URL: {b.Url} "));
}



// context.Delete(customer);
// context.SaveChanges();

// // Console.WriteLine("Delete the blog");
