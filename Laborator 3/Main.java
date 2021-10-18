public class Main
{
    public static void main(String[] args)
    {
           text t= new text();
            String o="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend nec dolor sit amet porttitor. Praesent quis fermentum mi. Nulla accumsan quam sed hendrerit imperdiet. Ut turpis odio, volutpat quis condimentum sit amet, lobortis non nisi. Etiam ac velit eu tellus pulvinar scelerisque. Pellentesque aliquet massa ac sem tincidunt, vehicula lacinia turpis lacinia. Curabitur tristique vulputate dui, dapibus efficitur odio dignissim a. Proin tristique vehicula velit sed auctor. Praesent lectus urna, ultricies non varius ut, commodo ut nisi. Sed maximus massa in massa ornare, a pretium ex gravida. Curabitur non dolor tortor. Integer venenatis, augue vitae rhoncus aliquam, sapien ante malesuada purus, at iaculis risus lacus et odio. Nulla ut libero consequat, sodales nibh sit amet, tempor ex. Duis at lacinia dui. Suspendisse nec dignissim neque.In tempor finibus ligula at tincidunt. Aenean vulputate augue sit amet gravida pulvinar. In accumsan molestie purus sit amet luctus. Nulla volutpat egestas turpis egestas consectetur. Aenean vel leo eget nisi imperdiet blandit sit amet a dolor. Cras id nulla quam. Phasellus ullamcorper eu diam ut pulvinar. Morbi tristique mollis odio, elementum fermentum ante bibendum ut. Nulla facilisi. Praesent suscipit, libero non ullamcorper egestas, odio arcu ornare velit, quis ultricies felis tellus ut risus. Integer rhoncus nunc at dolor maximus volutpat. Aliquam euismod mi in hendrerit sollicitudin.Vivamus diam nisl, luctus eu vulputate a, auctor a leo. Donec tristique mauris sed nisl ultricies sagittis. Sed feugiat, orci eu ultrices molestie, arcu nulla tempor augue, sit amet scelerisque lorem purus mattis ante. Donec nec fermentum metus. Nam mollis tellus faucibus, commodo risus a, tempus augue. Donec vulputate odio vel nulla lacinia hendrerit congue non dolor. Proin finibus massa nec odio rutrum, et ornare orci eleifend. Aenean mollis elementum eros sit amet porta. Integer euismod neque ac varius ullamcorper. Donec vel tellus placerat, consequat massa eu, vestibulum nibh. Suspendisse velit est, placerat eget mi sit amet, aliquam accumsan mauris. Sed varius consectetur elit, sed condimentum magna pharetra in. Cras sollicitudin sem augue, id lacinia lorem tempor eget."
             t.a=o;

        compute.compute_s(t);
        int nr=compute.compute_words(t);
        System.out.println("Number of Words: "+nr);

        levoca.leters(t);
        levoca.voca(t);

        words.tl(t);
        words.tmow(t);
    }
}
